package java_core.threads14.swingWorker;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public class SwingWorkerFrame extends JFrame {
    private JFileChooser chooser;
    private JTextArea textArea;
    private JLabel statusLine;
    private  JMenuItem openItem;
    private JMenuItem cancelItem;
    private SwingWorker<StringBuilder, ProgressData>textReader;
    public static final int TEXT_ROWS = 10;
    public static final int TEXT_COLUMNS = 60;

    public SwingWorkerFrame() throws HeadlessException {
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));

        textArea = new JTextArea(TEXT_ROWS, TEXT_COLUMNS);
        add(new JScrollPane(textArea));

        statusLine = new JLabel(" ");
        add(statusLine, BorderLayout.SOUTH);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("File");
        menuBar.add(menu);

        openItem = new JMenuItem("Open");
        menu.add(openItem);
        openItem.addActionListener(event->{
            int result = chooser.showOpenDialog(null);

            if(result == JFileChooser.APPROVE_OPTION){
                textArea.setText("");
                openItem.setEnabled(false);
                textReader = new TextReader(chooser.getSelectedFile());
                cancelItem.setEnabled(true);
            }
        });
        cancelItem = new JMenuItem("Cancel");
        menu.add(cancelItem);
        cancelItem.setEnabled(false);
        cancelItem.addActionListener(event-> textReader.cancel(true));

        pack();

    }
    private class ProgressData{
        public  int number;
        public String line;
    }
    private class TextReader extends SwingWorker<StringBuilder, ProgressData>{
        private File file;
        private StringBuilder text = new StringBuilder();

        public TextReader(File file) {
            this.file = file;
        }

        @Override
        protected StringBuilder doInBackground() throws IOException, InterruptedException {
            int lineNumber =0;
            try(Scanner in = new Scanner(new FileInputStream(file), "UTF-8")){
                while (in.hasNextLine()){
                    String line = in.nextLine();
                    lineNumber++;
                    text.append(line).append("\n");
                    ProgressData data = new ProgressData();
                    data.number = lineNumber;
                    data.line = line;
                    publish(data);
                    Thread.sleep(1);
                }
            }
            return text;
        }

        @Override
        protected void process(List<ProgressData> chunks) {

            if(isCancelled())return;
            StringBuilder b = new StringBuilder();
            statusLine.setText("" + chunks.get(chunks.size() -1).number);
            for(ProgressData d : chunks) b.append(d.line).append("\n");
            textArea.append(b.toString());

        }

        @Override
        protected void done() {
            try{
                StringBuilder result = get();
                textArea.setText(result.toString());
                statusLine.setText("Done");

            }catch (InterruptedException e){

            }catch (CancellationException e){
                textArea.setText("");
                statusLine.setText("Cancelled");
            }catch (ExecutionException e){
                statusLine.setText("" + e.getCause());
            }
            cancelItem.setEnabled(false);
            openItem.setEnabled(true);
        }
    }
}

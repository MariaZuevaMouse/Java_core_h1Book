package java_core.swingComponents12.EventTracer;

import java.awt.*;
import java.beans.BeanInfo;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class EventTracer {
    private InvocationHandler handler;

    public EventTracer() {
        handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method +":" + args[0]);
                return null;
            }
        };
    }
    public void add(Component c){
        try {
            BeanInfo info = Introspector.getBeanInfo(c.getClass());

            EventSetDescriptor[] eventSets =
                    info.getEventSetDescriptors();
            for(EventSetDescriptor eventSet : eventSets)
                addListener(c, eventSet);

        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        if( c instanceof Container){
            for (Component comp : ((Container)c).getComponents())
                add(comp);
        }
    }

    private void addListener(Component c, EventSetDescriptor eventSet) {
        Object proxy = Proxy.newProxyInstance(null, new Class[]
                {eventSet.getListenerType()}, handler);

        Method addListenerMethod = eventSet.getAddListenerMethod();

        try{
            addListenerMethod.invoke(c, proxy);
        }catch(ReflectiveOperationException e){
        }
    }
}

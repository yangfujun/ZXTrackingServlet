package gen.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * @Filename: SessionAttributerListener.java
 * @author Yang E-mail: yangfujun2006@hotmail.com
 * @Copyright: Copyright (c) 2017
 * @version created time：2019年1月30日 下午2:30:28
 * @version 1.0
 */
public class SessionAttributerListener implements HttpSessionAttributeListener {

	public SessionAttributerListener() {
		// TODO Auto-generated constructor stubtest
	}

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println("attribute added: " + event.getName() + " value: " + event.getValue());
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println("attribute removed: " + event.getName() + " value: " + event.getValue());
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
	}

}

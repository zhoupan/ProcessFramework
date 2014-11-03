package org.hive2hive.processframework;

import org.hive2hive.processframework.interfaces.IProcessComponent;
import org.hive2hive.processframework.interfaces.IProcessEventArgs;

/**
 * Default process event arguments.
 * 
 * @author Christian L�thold
 *
 */
public class ProcessEventArgs implements IProcessEventArgs {

	private IProcessComponent<?> source;

	public ProcessEventArgs(IProcessComponent<?> source) {
		this.source = source;
	}

	/**
	 * Gets the {@link IProcessComponent} that triggered the event.
	 */
	@Override
	public IProcessComponent<?> getSource() {
		return source;
	}

}

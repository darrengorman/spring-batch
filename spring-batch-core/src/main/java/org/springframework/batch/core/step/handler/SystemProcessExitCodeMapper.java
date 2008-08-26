package org.springframework.batch.core.step.handler;

import org.springframework.batch.core.step.handler.SystemCommandStepHandler;
import org.springframework.batch.repeat.ExitStatus;

/**
 * Maps the exit code of a system process to ExitStatus value
 * returned by a system command. Designed for use with the
 * {@link SystemCommandStepHandler}.
 * 
 * @author Robert Kasanicky
 */
public interface SystemProcessExitCodeMapper {
	
	/** 
	 * @param exitCode exit code returned by the system process
	 * @return ExitStatus appropriate for the <code>systemExitCode</code> parameter value
	 */
	ExitStatus getExitStatus(int exitCode);
}
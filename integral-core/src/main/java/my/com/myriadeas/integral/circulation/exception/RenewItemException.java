package my.com.myriadeas.integral.circulation.exception;

import my.com.myriadeas.integral.core.IntegralCirculationException;

public class RenewItemException extends
		IntegralCirculationException {

	private static final long serialVersionUID = 1L;

	private static final String messageId = "circulation.renew.error";

	public RenewItemException(String message,
			Object... arguments) {
		super(message, messageId, arguments);
	}

	public RenewItemException(String message,
			Throwable cause, Object... arguments) {
		super(message, cause, messageId, arguments);
	}
}

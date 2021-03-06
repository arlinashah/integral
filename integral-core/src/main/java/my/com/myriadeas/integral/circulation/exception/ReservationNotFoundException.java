package my.com.myriadeas.integral.circulation.exception;

import my.com.myriadeas.integral.core.IntegralCirculationException;
public class ReservationNotFoundException extends IntegralCirculationException {
	
	private static final long serialVersionUID = 1L;
	
	private static final String messageId = "reservationTransaction.notfound";

	public ReservationNotFoundException(String message, Object... arguments) {
		super(message, messageId, arguments);	
	}

	public ReservationNotFoundException(String message, Throwable cause,
			Object... arguments) {
		super(message, cause, messageId, arguments);
	}

}

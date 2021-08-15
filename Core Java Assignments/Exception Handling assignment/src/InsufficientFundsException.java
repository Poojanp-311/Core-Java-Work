
class InSufficientFundsException extends RuntimeException 
	{ 
		private String message; 
		
		public InSufficientFundsException(String message) 
		{ 
			this.message = message; 
		} 
		
		public InSufficientFundsException(Throwable cause, String message) 
		{ 
			super(cause); 
			this.message = message; 
		} 
		
		public String getMessage() 
		{ 
			return message; 
		} 
	}

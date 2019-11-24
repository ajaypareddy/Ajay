package day1.classroom;

public class Mobile {

		public long makeCall()
		{
			System.out.println("Mobile number is");
			return 8686833339L;
		}
		public String sendSMS()
		{
			System.out.println("Sending");
			return "Hello";
		}
		
		public void shutdown()
		{
			System.out.println("shutting down");
			
		}

		public static void main(String[] args) 
		{
			Mobile mobnum = new Mobile();
			long makeCall = mobnum.makeCall();
			System.out.println(makeCall);
			String sendSMS = mobnum.sendSMS();
			System.out.println(sendSMS);
			mobnum.shutdown();
		}
	
}
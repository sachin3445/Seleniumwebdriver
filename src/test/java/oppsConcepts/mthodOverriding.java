package oppsConcepts;

class Bank
{
	double roi ()
	{
		return 0;
	}
}

class ICICI extends Bank
{
	double roi ()
	{
		return 10.53;
	}
}


class SBI extends Bank
{
	double roi ()
	{
		return 7.53;
	}
}


public class mthodOverriding {

	public static void main(String[] args) {

		SBI sb = new SBI();
		System.out.println(sb.roi());
		
		ICICI ic = new ICICI();
		System.out.println(ic.roi());

	}

}

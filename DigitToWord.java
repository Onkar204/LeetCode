//GFG 3 : Program to print the given digit in words
class DigitToWord
{
	public static void main(String []args)
	{
		String number="1234";
		Switch(number)
		{
			case '0':System.out.print("Zero");
					 break;
			case '1':System.out.print("One");
					 break;
			case '2':System.out.print("Two");break;
			case '3':System.out.print("Three");break;
			case '4':System.out.print("Four");break;
			case '5':System.out.print("FIve");break;
			case '6':System.out.print("Six");break;
			case '7':System.out.print("Seven");break;
			case '8':System.out.print("Eight");break;
			case '9':System.out.print("Nine");break;
		    default:System.out.print("invalid number !!!");
		}
	}
}

import java.util.scanner;
class lab {
public static void main (String []args)
{
Scanner marks =new Scanner(system.in);

System.out.println("Enter matriculation percentage accurate=");
float matriculationPercentage=marks1.nextFloat();

System.out.println("Enter intermediate percentage accurate=");
float intermediatePercentage=marks1.nextFloat();

System.out.println("Enter test score=");
int testResult=marks1.nextInt();
double CPN=matriculationPercentage*0.1+intermediatePercentage*0.3+testResult*0.6;
System.out.println("Your CPN would be="+CPN);
}
}

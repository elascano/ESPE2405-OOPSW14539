
package income;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */
public class Tax {
        public static float calculateIt(float salary){
        float annualSalary = salary * 12;
        if ((annualSalary  >= 0) && (annualSalary <= 11902.00)){
          return 0.0f;
        }else if ((annualSalary  >= 11902.01) && (annualSalary  <= 15159.00)){
          return  5/100.0f;
        }else if ((annualSalary  >= 15159.01) && (annualSalary  <= 19682.00)){
          return 10/100.0f;
        }else if ((annualSalary  >= 19682.01) && (annualSalary  <= 26031.00)){
          return 12/100.0f;
        }else if ((annualSalary  >= 26031.01) && (annualSalary  <= 34255.00)){
          return 15/100.0f;
        }else if ((annualSalary  >= 34255.01) && (annualSalary  <= 45407.00)){
          return 20/100.0f;        
        }else if ((annualSalary  >= 45407.01) && (annualSalary  <= 60450.00)){
          return 25/100.0f;
        }else if ((annualSalary  >= 60450.01) && (annualSalary  <= 80605.00)){
          return 30/100.0f;
        }else if ((annualSalary  >= 80605.01) && (annualSalary  <= 107199.00)){
          return 35/100.0f;
        }else if (annualSalary  >= 107199.01){
          return 37/100.0f;
        }else {
          return 0.0f;
        }
    }
}

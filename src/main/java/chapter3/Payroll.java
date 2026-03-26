package main.java.chapter3;

/* Bad example of function :-
-> it's large
-> it will grow when new employee type is added
-> violates single responsibility principle (SRP) because there is more than one reason for it to change
-> violates open closed principle (OCP) because it must change when new types are added
-> unlimited number of other functions that will have the same structure
    eg., isPayday(Employee e, Date date), deliverPay(Employee e, Money pay)

   The solution to this problem is to bury the switch statement
   in the basement of an ABSTRACT FACTORY, and never let anyone see it.
   The factory will use the switch statement to create appropriate instances of
   the derivatives of Employee, and the various functions, such as calculatePay, isPayday, and deliverPay,
   will be dispatched polymorphically through the Employee interface.
 */
public class Payroll {
    public Money calculatePay(Employee e) throws InvalidEmployeeType {
        switch (e.type) {
            case COMISSIONED:
                return calculateComissionedPay(e);
            case HOURLY:
                return calculateHourlypay(e);
            case SALARIED:
                return calculateSlariedPay(e);
            default:
                throw new InvalidEmployeeType(e.type);
        }
    }
}

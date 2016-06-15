package fit;

import model.Employee;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class EmployeeFixture extends fit.ColumnFixture {

    public String firstName;
    public String lastName;
    public int salary;
    public String emailAddress;

    private static Validator validator;
    private Set<ConstraintViolation<Employee>> constraintViolations;

    public String verify() {

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();

        StringBuilder result = new StringBuilder();

        Employee employee = new Employee(firstName, lastName, salary, emailAddress);

        try {
            constraintViolations = validator.validate(employee);
        }
        catch (Exception e) {
            return e.getMessage();
        }

        if(constraintViolations.size() > 0) {
            for (ConstraintViolation<Employee> violation : constraintViolations) {
                result.append(violation.getPropertyPath() + ", ");
            }
            return result.substring(0, result.length() - 2);
        }
        else if(result.length() > 0) {
            return result.substring(0, result.length() - 2);
        }
        else {
            return "No rules to validate";
        }
    }
}

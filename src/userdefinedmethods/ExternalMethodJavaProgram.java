package userdefinedmethods;

public class ExternalMethodJavaProgram extends UserDefinedMethodsJavaProgram {

	public static void main(String[] args) {
		UserDefinedMethodsJavaProgram obj = new UserDefinedMethodsJavaProgram();
		// Calling non static methods - without extending class using object
		obj.withoutReturningAnyValuesUsingObj();

		// Calling static methods without using object - extending class (inheritance)
		withoutReturningAnyValuesWithoutObj();

		// without using object
		UserDefinedMethodsJavaProgram.withoutReturningAnyValuesWithoutObj();

	}

}

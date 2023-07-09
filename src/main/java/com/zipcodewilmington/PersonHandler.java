package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
       // String result = "";
        // create a `counter`
        int count = 0;
        StringBuilder join = new StringBuilder();

        // while `counter` is less than length of array
        // begin loop
        while(count<this.personArray.length){

            join.append(this.personArray[count]);
            count ++;
            //join.append("\nMy first name is ").append(this.personArray[count].getFirstName());
           // join.append("\nMy last name is ").append(this.personArray[count].getLastName());


        }

        return join.toString();
    }



    public String forLoop() {
        String result = "";
        int count = 0;
        StringBuilder join = new StringBuilder();

        for (int i=0;count<this.personArray.length;i++){
            join.append(this.personArray[count]);
            count ++;
        }

        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return join.toString();
    }



    public String forEachLoop() {
        String result = "";
        int count = 0;
        StringBuilder join = new StringBuilder();
        // identify array's type
        // identify array's variable-name
        for (Person person: this.personArray) {
            join.append(this.personArray[count]);
            count ++;
        }
        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return join.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}

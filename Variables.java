class Variables {
   
    @SuppressWarnings("unused")
    public static void main(String[] args){
        int age=10;
        String name="Aman";
        System.out.println(name);
        String neighbour=name;
        char ch='@';

        // Non-Primitive data types
        String name1="Aman";
        String name2= new String("Appu");
        System.out.println(name.length());
        System.out.println(name1.charAt(0));
        // strings are immutable in java

        String name3=name.replace('a', 'z');
        System.out.println(name3);

    }
}

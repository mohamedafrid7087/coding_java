package strings;

class CommandLine {
    int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int c;
        CommandLine cat = new CommandLine();
        int dog,elephant;
        dog=Integer.parseInt(args[0]);
        elephant=Integer.parseInt(args[1]);
        c = cat.sum(dog,elephant);

        System.out.println("adding of two number is :" + c);

    }
}


package repository;

public class Main {
    
    public static void main(String[] args) {
        Repo<String> repo = new Repo<>();
        Repo<Integer> intRepo = new Repo<>();

        printRepo("String", repo);
        printRepo("Integer", intRepo);

        repo.add("izu");
        repo.add("tsumi");
        
        intRepo.add(1);
        intRepo.add(2);

        printRepo("String", repo);
        printRepo("Integer", intRepo);
    }

    private static <T> void printRepo(String name, Repo<T> repo) {
        System.out.println("\nLast %s repo item: %s".formatted(name.toLowerCase(), repo.obtainLast()));
        System.out.println("%s repo amount: %d".formatted(name, repo.amount()));

        for (int i = 0; i < repo.amount(); i++) {
            System.out.println("%s repo item %d: %s".formatted(name, i, repo.obtain(i)));
        }
    }
}

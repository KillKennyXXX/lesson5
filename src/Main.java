public class Main {

    public static void main(String[] args) {

        Worker Vitaliy = new Worker("Виталий", "ssgvv@sf", 682230209, 10560, 45);
        Worker Vasiliy = new Worker("Василий", "ssszbnrdvv@sf", 682230280, 18560, 35);
        Worker Alex = new Worker("Алексей", "ssgzbas@sf", 682230200, 550560, 25);
        Worker Andrey = new Worker("Андрей", "ssvzsdbdvv@sf", 686530200, 1060, 40);
        Worker Timofey = new Worker("Тимофей", "sgdv@sf", 682530250, 50560, 60);



        Worker[] workers = {Vitaliy, Vasiliy, Alex, Andrey,Timofey};
        for (Worker worker : workers) {
           if (worker.getAge()>40) {
               worker.info();
           }
        }
    }
}

package lessons_21;

public class Autobus {

    //Для создания связи типа HAS-A мы определяем поле класса,
    // которое будет хранить ссылку на обьект другого класса
    // Направленность связи - однонаправленная или двунаправленная

    // Кардинальность связи - определяет б сколько обьектов одного класса,
    // может быть ассоциировано  с обьектом другого класса.


    private  BusDriver driver; // агрегация (мягкая связь)

    private final Autopilot autopilot; // композиция (жесткая неразрывная связь)

    private int capacity;

    private int countPassenger;

    private final Passenger[] passengers;
    public Autobus(BusDriver busDriver, int capacity){
        this.driver = busDriver;
        autopilot = new Autopilot("AP-005");
        this.capacity = capacity;
        this.passengers = new Passenger[capacity];
    }

    //public boolean takePassenger(Passenger passenger) {
      //  for (int i = 0; i < passengers.length; i++){
        //    if (passengers[i] == null){
          //      passengers[i] = passenger;
           //     return true;
           // }
       // }

         //   return false;
       // }
         public boolean takePassenger(Passenger passenger) {
             if (countPassenger < capacity) {

                 passengers[countPassenger] = passenger;
                 countPassenger++;
                 System.out.println("Пассажир сел");
                 return true;
             } else {
                 //свободного места нет
                 System.out.println("мест нет");
                 return false;
             }
         }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    @Override
    public String toString() {
        return "Autobus:  {" + " driver: " + driver.getLicenseNumber() + " ; autopilot: " + autopilot.getSoftwareVer() + "}";
    }
    public String getStringPassengersList(){
        //Перебрать список пассажиров. Приклеить к строке пассажира в едином виде id + name
        // т.к пассажир- ссылочный тип данных - приклеивать только не null ссылки
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null){
                //добавляем инфо о пассажире
                Passenger current = passengers[i];
                sb.append("Passenger: {id: ").append(current.getId()).append("; name").append(current.getName()).append("}");
                sb.append("; ");
            }
        }

        //нам надо проверить был ли добавлен хоть бы один пассажир
        // если был то отрезать 2 последних символа
        if (sb.length() > 1){
            sb.setLength(sb.length() - 2);
        }
        sb.append("}");
        return sb.toString();
    }


}

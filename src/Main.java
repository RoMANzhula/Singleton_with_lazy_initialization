import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

    }
    public static Planets thePlanet; // створюємо посилальну змінну типу інтерфейсу Planets

    static { // створюємо статичний блок, для запуску статичного методу ініціалізації статичного поля thePlanet
        try { // намагаємось виконати наступне
            readTextFromConsoleAndInitPlanet(); // виконуємо метод для ініціалізації планети за введеною користувачем рядком
        } catch (IOException ioException) { // ловимо виключення для входу/виходу
            ioException.printStackTrace(); // виводимо стек для зловленого виключення
        }
    }

    public static void readTextFromConsoleAndInitPlanet() throws IOException { // метод для ініціалізації планети за введеною користувачем рядком
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); // відкриваємо буферизований
        // потік для вводу даних з клавіатури

        String inputString = bufferedReader.readLine().toLowerCase(); // створюємо посилальну змінну строкового типу, яку
        // ініціалізуємо рядком, введеним користувачем, і перетвореним на нижній регістр

        if (inputString.equals("sun")) { // якщо введений користувачем рядок буде рівний літералу "sun", то
            thePlanet = Sun.getInstance(); // посилальній змінній thePlanet присвоюємо значення = синглетону класу Sun
            System.out.println(thePlanet.getClass()); // повертаємо назву класу
        } else if (inputString.equals("earth")) { // якщо введений користувачем рядок буде рівний літералу "earth", то
            thePlanet = Earth.getInstance(); // посилальній змінній thePlanet присвоюємо значення = синглетону класу Earth
            System.out.println(thePlanet.getClass()); // повертаємо назву класу
        } else if (inputString.equals("moon")) { // якщо введений користувачем рядок буде рівний літералу "moon", то
            thePlanet = Moon.getInstance(); // посилальній змінній thePlanet присвоюємо значення = синглетону класу Moon
            System.out.println(thePlanet.getClass()); // повертаємо назву класу
        } else if (inputString.equals("jupiter")) { // якщо введений користувачем рядок буде рівний літералу "jupiter", то
            thePlanet = Jupiter.getInstance(); // посилальній змінній thePlanet присвоюємо значення = синглетону класу Jupiter
            System.out.println(thePlanet.getClass()); // повертаємо назву класу
        } else if (inputString.equals("mars")) { // якщо введений користувачем рядок буде рівний літералу "mars", то
            thePlanet = Jupiter.getInstance(); // посилальній змінній thePlanet присвоюємо значення = синглетону класу Mars
            System.out.println(thePlanet.getClass()); // повертаємо назву класу
        } else if (inputString.equals("mercury")) { // якщо введений користувачем рядок буде рівний літералу "mercury", то
            thePlanet = Jupiter.getInstance(); // посилальній змінній thePlanet присвоюємо значення = синглетону класу Mercury
            System.out.println(thePlanet.getClass()); // повертаємо назву класу
        } else if (inputString.equals("neptune")) { // якщо введений користувачем рядок буде рівний літералу "neptune", то
            thePlanet = Jupiter.getInstance(); // посилальній змінній thePlanet присвоюємо значення = синглетону класу Neptune
            System.out.println(thePlanet.getClass()); // повертаємо назву класу
        } else if (inputString.equals("saturn")) { // якщо введений користувачем рядок буде рівний літералу "saturn", то
            thePlanet = Jupiter.getInstance(); // посилальній змінній thePlanet присвоюємо значення = синглетону класу Saturn
            System.out.println(thePlanet.getClass()); // повертаємо назву класу
        } else if (inputString.equals("uranus")) { // якщо введений користувачем рядок буде рівний літералу "uranus", то
            thePlanet = Jupiter.getInstance(); // посилальній змінній thePlanet присвоюємо значення = синглетону класу Uranus
            System.out.println(thePlanet.getClass()); // повертаємо назву класу
        } else if (inputString.equals("venus")) { // якщо введений користувачем рядок буде рівний літералу "venus", то
            thePlanet = Jupiter.getInstance(); // посилальній змінній thePlanet присвоюємо значення = синглетону класу Venus
            System.out.println(thePlanet.getClass()); // повертаємо назву класу
        } else { // в іншому випадку
            thePlanet = null; // посилальній змінній thePlanet присвоюємо значення = null (залишається порожнім)
            System.out.println("Not class"); // повертаємо "немає класу"
        }
    }
}


//Для вирішення цього завдання тобі потрібно:
//Знайти приклад патерну Singleton з лінивою реалізацією (lazy initialization).
/ / За образом і подобою в окремих файлах створити в окремих файлах три класи синглтона - Sun, Moon, Earth.
//Реалізувати інтерфейс Planets у класах Sun, Moon, Earth.
//У статичному блоці класу Solution викликати метод readKeyFromConsoleAndInitPlanet().
//Реалізувати функціонал методу readKeyFromConsoleAndInitPlanet():
//для цього рахуй з консолі один параметр типу String.
//якщо він дорівнює одній з констант інтерфейсу Planets, створи відповідний об'єкт і присвойте його Planets thePlanet,
/ / Інакше - обнули Planets thePlanet.

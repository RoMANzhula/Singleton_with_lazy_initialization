import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

    }
    public static Planets thePlanet; //создаем ссылочную переменную типа интерфейса Planets

    static { //создаем статический блок, для запуска статического метода инициализации статического поля thePlanet
        try { //пытаемся выполнить следующее
            readTextFromConsoleAndInitPlanet(); //выполняем метод для инициализации планеты по введенной пользователем строке
        } catch (IOException ioException) { //ловим исключение входных/выходных потоков
            ioException.printStackTrace(); //выводим стек для пойманного исключения
        }
    }

    public static void readTextFromConsoleAndInitPlanet() throws IOException { //метод для инициализации планеты по введенной пользователем строке
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //открываем буферизированный
        //поток для ввода данных с клавиатуры

        String inputString = bufferedReader.readLine().toLowerCase(); //создаем ссылочную переменную строкового типа, которую
        // инициализируем строкой введенной пользователем и преобразованной в нижний регистр

        if (inputString.equals("sun")) { //если введенная пользователем строка будет равна литералу "sun", то
            thePlanet = Sun.getInstance(); //ссылочной переменной thePlanet присваиваем значение = Синглетону класса Sun
            System.out.println(thePlanet.getClass()); //возвращаем название класса
        } else if (inputString.equals("earth")) { //иначе если введенная пользователем строка будет равна литералу "earth", то
            thePlanet = Earth.getInstance(); //ссылочной переменной thePlanet присваиваем значение = Синглетону класса Earth
            System.out.println(thePlanet.getClass()); //возвращаем название класса
        } else if (inputString.equals("moon")) { //иначе если введенная пользователем строка будет равна литералу "moon", то
            thePlanet = Moon.getInstance(); //ссылочной переменной thePlanet присваиваем значение = Синглетону класса Moon
            System.out.println(thePlanet.getClass()); //возвращаем название класса
        } else if (inputString.equals("jupiter")) { //иначе если введенная пользователем строка будет равна литералу "jupiter", то
            thePlanet = Jupiter.getInstance(); //ссылочной переменной thePlanet присваиваем значение = Синглетону класса Jupiter
            System.out.println(thePlanet.getClass()); //возвращаем название класса
        } else if (inputString.equals("mars")) { //иначе если введенная пользователем строка будет равна литералу "mars", то
            thePlanet = Jupiter.getInstance(); //ссылочной переменной thePlanet присваиваем значение = Синглетону класса Mars
            System.out.println(thePlanet.getClass()); //возвращаем название класса
        } else if (inputString.equals("mercury")) { //иначе если введенная пользователем строка будет равна литералу "mercury", то
            thePlanet = Jupiter.getInstance(); //ссылочной переменной thePlanet присваиваем значение = Синглетону класса Mercury
            System.out.println(thePlanet.getClass()); //возвращаем название класса
        } else if (inputString.equals("neptune")) { //иначе если введенная пользователем строка будет равна литералу "neptune", то
            thePlanet = Jupiter.getInstance(); //ссылочной переменной thePlanet присваиваем значение = Синглетону класса Neptune
            System.out.println(thePlanet.getClass()); //возвращаем название класса
        } else if (inputString.equals("saturn")) { //иначе если введенная пользователем строка будет равна литералу "saturn", то
            thePlanet = Jupiter.getInstance(); //ссылочной переменной thePlanet присваиваем значение = Синглетону класса Saturn
            System.out.println(thePlanet.getClass()); //возвращаем название класса
        } else if (inputString.equals("uranus")) { //иначе если введенная пользователем строка будет равна литералу "uranus", то
            thePlanet = Jupiter.getInstance(); //ссылочной переменной thePlanet присваиваем значение = Синглетону класса Uranus
            System.out.println(thePlanet.getClass()); //возвращаем название класса
        } else if (inputString.equals("venus")) { //иначе если введенная пользователем строка будет равна литералу "venus", то
            thePlanet = Jupiter.getInstance(); //ссылочной переменной thePlanet присваиваем значение = Синглетону класса Venus
            System.out.println(thePlanet.getClass()); //возвращаем название класса
        } else { //иначе
            thePlanet = null; //ссылочной переменной thePlanet присваиваем значение = null (остается пустой)
            System.out.println("Not class"); //возвращаем нет класса
        }
    }
}

//Для решения этой задачи тебе нужно:
//Найти пример паттерна Singleton с ленивой реализацией (lazy initialization).
//По образу и подобию в отдельных файлах создать в отдельных файлах три класса синглтона — Sun, Moon, Earth....
//Реализовать интерфейс Planets в классах Sun, Moon, Earth....
//В статическом блоке класса Solution вызвать метод readKeyFromConsoleAndInitPlanet().
//Реализовать функционал метода readKeyFromConsoleAndInitPlanet():
//для этого считай с консоли один параметр типа String.
//если он равен одной из констант интерфейса Planets, создай соответствующий объект и присвой его Planets thePlanet,
// иначе — обнули Planets thePlanet.

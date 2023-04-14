public class Uranus implements Planets {
    private static Uranus INSTANCE; //создаем приватную статическую ссылочную переменную Синглетон - ОБРАЗЕЦ

    private Uranus() {} //создаем приватный конструктор данного класса, который не дает возможности создавать новые обьекты
    // за пределами данного класса (так сказать реализует возможность быть классу Синглетоном)

    public static Uranus getInstance() { //публичный статический метод, который возвращает экземпляр класса, данный метод называют
        // getInstance - получить экземпляр. Это глобальная точка доступа к экземпляру класса. Метод позволяет выполнить ленивую
        //загрузку
        if (INSTANCE == null) { //если ОБРАЗЕЦ не создан(не инициализирован), то
            synchronized (Uranus.class) { //выполняем синхронизацию для потокобезопасности (при многопоточности)
                if (INSTANCE == null) { //еще раз проверяем, что ОБРАЗЕЦ не создан(не инициализирован)
                    INSTANCE = new Uranus(); //инициализируем его
                }
            }
        }
        return INSTANCE; //возвращаем проинициализированный ОБРАЗЕЦ
    }
}

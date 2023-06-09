public class Saturn implements Planets {
    private static Saturn INSTANCE; //создаем приватную статическую ссылочную переменную Синглетон - ОБРАЗЕЦ

    private Saturn() {} //создаем приватный конструктор данного класса, который не дает возможности создавать новые обьекты
    // за пределами данного класса (так сказать реализует возможность быть классу Синглетоном)

    public static Saturn getInstance() { //публичный статический метод, который возвращает экземпляр класса, данный метод называют
        // getInstance - получить экземпляр. Это глобальная точка доступа к экземпляру класса. Метод позволяет выполнить ленивую
        //загрузку
        if (INSTANCE == null) { //если ОБРАЗЕЦ не создан(не инициализирован), то
            synchronized (Saturn.class) { //выполняем синхронизацию для потокобезопасности (при многопоточности)
                if (INSTANCE == null) { //еще раз проверяем, что ОБРАЗЕЦ не создан(не инициализирован)
                    INSTANCE = new Saturn(); //инициализируем его
                }
            }
        }
        return INSTANCE; //возвращаем проинициализированный ОБРАЗЕЦ
    }
}

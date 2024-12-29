public class SingleObject {

    /*
    بهتره به جای new کردن مستقیم instance به صورت lazy initialize استفاده کنیم تا در صورت تیاز instance ساخته یشه
     */
//    private static SingleObject instance = new SingleObject();

    private static SingleObject instance;

    // باید private باشه تا بیرون از این کلاس کسی نتونه مکانیزم initialize کال کنه
    private SingleObject() { } //

    public static SingleObject getInstance() {

        if(instance == null) {
            /* به جای synchronize کردن کل متد با ایجاد بلاک synchronized در صورت نیاز استفاده میکنیم
            اگر کل متد رو synchronized کنیم هر کلاسی که این متد رو کال کنه لاک میشه و عملا پرفورمنس بی دلیل کاهش
             پیدا میکنه
             */
            synchronized (SingleObject.class) {
                // در عملیات مالتی تردینگ برای اطمینان بیشتر با دابل چک مجدد از بروز خطا جلوگیری میکنیم
                if(instance == null) {
                    instance = new SingleObject();
                }
            }
        }

        return instance;
    }

    public void showMessage() {
        System.out.println("Hello world!");
    }
}

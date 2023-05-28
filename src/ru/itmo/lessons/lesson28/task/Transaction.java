package ru.itmo.lessons.lesson28.task;

public class Transaction implements Runnable{
    private Account src; // с какого аккаунта осуществлять перевод
    private Account dst; // на какой аккаунт осуществлять перевод
    private int money; // сколько переводить

    public Transaction(Account src, Account dst, int money) {
        this.src = src;
        this.dst = dst;
        this.money = money;
    }

    @Override
    public void run() {
        // TODO перевод денежных средств со счета src на счет dst в количестве money
        synchronized (src){
            synchronized (dst){
                if(src.getBalance() >= this.money){
                    dst.setBalance(dst.getBalance() + this.money);
                    src.setBalance(src.getBalance() - this.money);
                }
            }
        }
    }
}
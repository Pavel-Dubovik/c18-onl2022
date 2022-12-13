package by.tms.task2.model;

public class Atelier {
    private Clothes[] clothes;

    public Atelier(Clothes[] clothes) {
        this.clothes = clothes;
    }

    public void dressMan() {
        for (Clothes clothe : clothes) {
            if (clothe instanceof IMensClothing) {
                ((IMensClothing) clothe).dressMan();
            }
        }
    }

    public void dessWoman() {
        for (Clothes clothe : clothes) {
            if (clothe instanceof IWomenClothing) {
                ((IWomenClothing) clothe).dressWomen();
            }
        }
    }
}

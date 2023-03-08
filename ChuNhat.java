package lap4;

import java.util.Scanner;

/**
 *
 * @author VQ
 */
public class ChuNhat {
    protected double dai, rong;

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getChuVi() {
        return 2 * (dai + rong);
    }

    public double getDienTich() {
        return dai * rong;
    }

    public void xuat() {
        System.out.println("Chieu dai: " + dai);
        System.out.println("Chieu rong: " + rong);
        System.out.println("Dien tich: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}

class Vuong extends ChuNhat {
    public Vuong(double canh) {
        super(canh, canh);
    }

    public void xuat() {
        System.out.println("Canh: " + dai);
        System.out.println("Dien tich: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu dai hinh chu nhat: ");
        double daiCN = scanner.nextDouble();
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        double rongCN = scanner.nextDouble();

        System.out.print("Nhap canh hinh vuong: ");
        double canhVuong = scanner.nextDouble();

        ChuNhat cn = new ChuNhat(daiCN, rongCN);
        Vuong vu = new Vuong(canhVuong);

        cn.xuat();
        vu.xuat();
    }
}





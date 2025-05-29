package methode;

import java.util.Scanner;

public class dosenrechner {

        static Scanner scanner = new Scanner(System.in);
        static double radius;
        static double höhe;
        static double pi = Math.PI;
        static int auswal;

        public static void main(String[] args) {
            System.out.println(" dosen rechner");
            System.out.print(" gib mal raduis  und höhe ein : ");
            radius = scanner.nextDouble();
            höhe = scanner.nextDouble();
            shoifo();
            System.out.println("ciao");


        }

        public static double umfang(double radius) {
            return 2 * pi * radius;
        }

        public static double deckelfläche(double radius) {
            return pi * (radius * radius);
        }

        public static double mantelfläche(double radius, double höhe) {
            return umfang(radius) * höhe;
        }

        public static double oberfläche(double radius, double höhe) {
            return 2 * deckelfläche(radius) + mantelfläche(radius, höhe);
        }

        public static double volume(double radius, double höhe) {
            return deckelfläche(radius) * höhe;
        }

        public static void shoifo() {
            do {
                System.out.println("1.umfang: " );
                System.out.println("2.Deckelfläche: " );
                System.out.println("3.Mantelfläche: " );
                System.out.println("4.Oberfläche: " );
                System.out.println("5.Volume: ");
                System.out.println("bitt auswäln ");
                auswal = scanner.nextInt();
                switch (auswal) {
                    case 1:
                        System.out.println("umfang: " + umfang(radius));
                        break;
                    case 2:
                        System.out.println("Deckelfläche: " + deckelfläche(radius));
                        break;
                    case 3:
                        System.out.println("Mantelfläche: " + mantelfläche(radius, höhe));
                        break;
                    case 4:
                        System.out.println("Oberfläche: " + oberfläche(radius, höhe));
                        break;
                    case 5:
                        System.out.println("Volume: " + volume(radius, höhe));
                        break;
                    case 6:
                        System.out.println("Exit");
                    default:
                        System.out.println("tchüss");

                }
            }while (auswal != 6  );

        }
        public static void printinfoo(){
            System.out.println("umfang: " + umfang(radius));
            System.out.println("Deckelfläche: " + deckelfläche(radius));
            System.out.println("Mantelfläche: " + mantelfläche(radius, höhe));
            System.out.println("Oberfläche: " + oberfläche(radius, höhe));
            System.out.println("Volume: " + volume(radius, höhe));



        }
        public static void sho(){
            System.out.println("1.umfang: " );
            System.out.println("2.Deckelfläche: " );
            System.out.println("3.Mantelfläche: " );
            System.out.println("4.Oberfläche: " );
            System.out.println("5.Volume: ");
        }
    }


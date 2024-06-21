//package org.example.exoCompteBancaire;
//
//import java.util.Scanner;
//
//public class IHM {
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        int choix;
//
//        do {
//            System.out.println("=== Menu Principal ===");
//            System.out.println("1. Lister les comptes bancaires");
//            System.out.println("2. Creer un compte bancaire");
//            System.out.println("3. Effectuer un depot");
//            System.out.println("4. Effectuer un retrait");
//            System.out.println("5. Afficher les operations et le solde");
//            System.out.println("0. Quitter le programme");
//            System.out.print("Votre choix : ");
//
////            choix = scanner.nextInt();
////
////            switch (choix) {
////                case 1:
////                    listerComptes();
////                    break;
////                case 2:
////                    creerCompte(scanner);
////                    break;
////                case 3:
////                    effectuerDepot(scanner);
////                    break;
////                case 4:
////                    effectuerRetrait(scanner);
////                    break;
////                case 5:
////                    afficherOperationsEtSolde(scanner);
////                    break;
////                case 0:
////                    System.out.println("Au revoir!");
////                    break;
////                default:
////                    System.out.println("Choix invalide.");
////            }
////        } while (choix != 0);
//
////    }
//
//
//
///*
//
////      public static void main(String[] args) {
//
//
//
//
//
//    private static void listerComptes() {
//        System.out.println("=== Liste des Comptes Bancaires ===");
//        for (CompteBancaire compte : client.getComptes()) {
//            System.out.println(compte);
//        }
//    }
//
//    private static void creerCompte(Scanner scanner) {
//        System.out.println("=== Creation de Compte ===");
//        System.out.println("1. Creer un compte courant");
//        System.out.println("2. Creer un compte epargne");
//        System.out.println("3. Creer un compte payant");
//        System.out.println("8. Annuler la creation de compte");
//        System.out.print("Votre choix : ");
//        int choix = scanner.nextInt();
//        scanner.nextLine();  // Consume newline
//
//        CompteBancaire compte = null;
//
//        switch (choix) {
//            case 1:
//                compte = new CompteCourant(client, 0);
//                break;
//            case 2:
//                compte = new CompteEpargne(client, 0);
//                break;
//            case 3:
//                compte = new ComptePayant(client, 0);
//                break;
//            case 8:
//                System.out.println("Creation de compte annulee.");
//                return;
//            default:
//                System.out.println("Choix invalide.");
//                return;
//        }
//
//        client.ajouterCompte(compte);
//        System.out.println("Compte cree avec succes.");
//    }
//
//    private static void effectuerDepot(Scanner scanner) {
//        System.out.println("=== Effectuer un Depot ===");
//        System.out.print("Numero de compte : ");
//        int index = scanner.nextInt();
//        System.out.print("Montant du depot : ");
//        double montant = scanner.nextDouble();
//
//        if (index >= 0 && index < client.getComptes().size()) {
//            CompteBancaire compte = client.getComptes().get(index);
//            compte.deposer(montant);
//            System.out.println("Depot effectue avec succes.");
//        } else {
//            System.out.println("Compte invalide.");
//        }
//    }
//
//    private static void effectuerRetrait(Scanner scanner) {
//        System.out.println("=== Effectuer un Retrait ===");
//        System.out.print("Numero de compte : ");
//        int index = scanner.nextInt();
//        System.out.print("Montant du retrait : ");
//        double montant = scanner.nextDouble();
//
//        if (index >= 0 && index < client.getComptes().size()) {
//            CompteBancaire compte = client.getComptes().get(index);
//            compte.retirer(montant);
//            System.out.println("Retrait effectue avec succes.");
//        } else {
//            System.out.println("Compte invalide.");
//        }
//    }
//
//    private static void afficherOperationsEtSolde(Scanner scanner) {
//        System.out.println("=== Afficher Operations et Solde ===");
//        System.out.print("Numero de compte : ");
//        int index = scanner.nextInt();
//
//        if (index >= 0 && index < client.getComptes().size()) {
//            CompteBancaire compte = client.getComptes().get(index);
//            System.out.println("Solde: " + compte.getSolde());
//            for (Operation operation : compte.getOperations()) {
//                System.out.println(operation);
//            }
//        } else {
//            System.out.println("Compte invalide.");
//        }
//    }
//}
//
//// */
////    }
////
////
////}

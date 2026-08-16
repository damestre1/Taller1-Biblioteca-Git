package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Customer> customers = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Aquí irá el menú (Fase 8)

    }

    static void createCustomer() {

        System.out.print("Ingresa ID: ");
        String id = sc.nextLine();

        System.out.print("Ingresa tu Nombre: ");
        String name = sc.nextLine();

        System.out.print("Ingresa tu Telefono: ");
        String phone = sc.nextLine();

        System.out.print("Ingresa tu  email: ");
        String email = sc.nextLine();

        Customer customer = new Customer(id, name, phone, email);

        customers.add(customer);

        System.out.println("Customer created successfully.");
    }
}
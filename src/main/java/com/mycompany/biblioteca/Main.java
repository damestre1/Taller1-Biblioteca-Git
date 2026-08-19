package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Customer> customers = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Libro> libros = new ArrayList<>();
    static ArrayList<Prestamo> prestamos = new ArrayList<>();
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

        System.out.println("cliente creado exitosamente");
    }

static void listCustomers() {

    if (customers.isEmpty()) {
        System.out.println("No ha sido registrafo el cliente");
        return;
    }

    System.out.println("=== Lista de clientes ===");

    for (Customer customer : customers) {
        System.out.println("ID: " + customer.getId());
        System.out.println("Nombre: " + customer.getName());
        System.out.println("Telefono: " + customer.getPhone());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("--------------------");
    }
}
    static void searchCustomer() {

        System.out.print("Ingresar el cliente por id : ");
        String id = sc.nextLine();

        for (Customer customer : customers) {

            if (customer.getId().equals(id)) {

                System.out.println("Cliente Encontrado:");
                System.out.println("ID: " + customer.getId());
                System.out.println("Nombre: " + customer.getName());
                System.out.println("Telefono: " + customer.getPhone());
                System.out.println("Email: " + customer.getEmail());

                return;
            }
        }

        System.out.println("El Cliente No Fue Encontrado.");
    }
    static void updateCustomer() {

        System.out.print("Ingrese el ID del cliente que desea actualizar: ");
        String id = sc.nextLine();

        for (Customer customer : customers) {

            if (customer.getId().equals(id)) {

                System.out.print("Ingrese el nuevo nombre: ");
                String name = sc.nextLine();

                System.out.print("Ingrese el nuevo telefono: ");
                String phone = sc.nextLine();

                System.out.print("Ingrese el nuevo email: ");
                String email = sc.nextLine();

                customer.setName(name);
                customer.setPhone(phone);
                customer.setEmail(email);

                System.out.println("Cliente actualizado exitosamente.");
                return;
            }
        }

        System.out.println("El cliente no fue encontrado.");
    }
    static void deleteCustomer() {

        System.out.print("Ingrese el ID del cliente que desea eliminar: ");
        String id = sc.nextLine();

        for (int i = 0; i < customers.size(); i++) {

            if (customers.get(i).getId().equals(id)) {

                customers.remove(i);

                System.out.println("Cliente eliminado exitosamente.");
                return;
            }
        }

        System.out.println("El cliente no fue encontrado.");
    }
    static void createBook() {

        System.out.print("Ingrese código del libro: ");
        String code = sc.nextLine();

        System.out.print("Ingrese título del libro: ");
        String title = sc.nextLine();

        System.out.print("Ingrese autor del libro: ");
        String author = sc.nextLine();

        System.out.print("Ingrese género del libro: ");
        String genre = sc.nextLine();

        Libro libro = new Libro(code, title, author, genre);

        libros.add(libro);

        System.out.println("Libro creado exitosamente.");
    }
    static void listBooks() {

        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }

        System.out.println("=== Lista de libros ===");

        for (Libro libro : libros) {
            System.out.println("Código: " + libro.getCode());
            System.out.println("Título: " + libro.getTitle());
            System.out.println("Autor: " + libro.getAuthor());
            System.out.println("Género: " + libro.getGenre());
            System.out.println("--------------------");
        }
    }
    static void searchBook() {

        System.out.print("Ingrese el código del libro a buscar: ");
        String code = sc.nextLine();

        for (Libro libro : libros) {

            if (libro.getCode().equals(code)) {

                System.out.println("Libro encontrado:");
                System.out.println("Código: " + libro.getCode());
                System.out.println("Título: " + libro.getTitle());
                System.out.println("Autor: " + libro.getAuthor());
                System.out.println("Género: " + libro.getGenre());

                return;
            }
        }

        System.out.println("El libro no fue encontrado.");
    }
    static void updateBook() {

        System.out.print("Ingrese el código del libro que desea actualizar: ");
        String code = sc.nextLine();

        for (Libro libro : libros) {

            if (libro.getCode().equals(code)) {

                System.out.print("Ingrese el nuevo título: ");
                String title = sc.nextLine();

                System.out.print("Ingrese el nuevo autor: ");
                String author = sc.nextLine();

                System.out.print("Ingrese el nuevo género: ");
                String genre = sc.nextLine();

                libro.setTitle(title);
                libro.setAuthor(author);
                libro.setGenre(genre);

                System.out.println("Libro actualizado exitosamente.");
                return;
            }
        }

        System.out.println("El libro no fue encontrado.");
    }
    static void deleteBook() {

        System.out.print("Ingrese el código del libro que desea eliminar: ");
        String code = sc.nextLine();

        for (int i = 0; i < libros.size(); i++) {

            if (libros.get(i).getCode().equals(code)) {

                libros.remove(i);

                System.out.println("Libro eliminado exitosamente.");
                return;
            }
        }

        System.out.println("El libro no fue encontrado.");
    }
    static void createLoan() {

        System.out.print("Ingrese el ID del cliente: ");
        String customerId = sc.nextLine();

        Customer customerEncontrado = null;

        for (Customer customer : customers) {
            if (customer.getId().equals(customerId)) {
                customerEncontrado = customer;
                break;
            }
        }

        if (customerEncontrado == null) {
            System.out.println("El cliente no fue encontrado.");
            return;
        }

        System.out.print("Ingrese el código del libro: ");
        String bookCode = sc.nextLine();

        Libro libroEncontrado = null;

        for (Libro libro : libros) {
            if (libro.getCode().equals(bookCode)) {
                libroEncontrado = libro;
                break;
            }
        }

        if (libroEncontrado == null) {
            System.out.println("El libro no fue encontrado.");
            return;
        }

        System.out.print("Ingrese la fecha del préstamo: ");
        String fechaPrestamo = sc.nextLine();

        Prestamo prestamo = new Prestamo(
                customerEncontrado,
                libroEncontrado,
                fechaPrestamo
        );

        prestamos.add(prestamo);

        System.out.println("Préstamo registrado exitosamente.");
    }
    static void returnLoan() {

        System.out.print("Ingrese el ID del cliente: ");
        String customerId = sc.nextLine();

        System.out.print("Ingrese el código del libro: ");
        String bookCode = sc.nextLine();

        for (Prestamo prestamo : prestamos) {

            if (prestamo.getCustomer().getId().equals(customerId)
                    && prestamo.getLibro().getCode().equals(bookCode)
                    && !prestamo.isDevuelto()) {

                System.out.print("Ingrese la fecha de devolución: ");
                String fechaDevolucion = sc.nextLine();

                prestamo.setFechaDevolucion(fechaDevolucion);
                prestamo.setDevuelto(true);

                System.out.println("Préstamo devuelto exitosamente.");
                return;
            }
        }

        System.out.println("El préstamo no fue encontrado o ya fue devuelto.");
    }
    static void listLoans() {

        if (prestamos.isEmpty()) {
            System.out.println("No hay préstamos registrados.");
            return;
        }

        System.out.println("=== Lista de préstamos ===");

        for (Prestamo prestamo : prestamos) {

            System.out.println("Cliente ID: " + prestamo.getCustomer().getId());
            System.out.println("Cliente: " + prestamo.getCustomer().getName());

            System.out.println("Libro código: " + prestamo.getLibro().getCode());
            System.out.println("Libro: " + prestamo.getLibro().getTitle());

            System.out.println("Fecha de préstamo: " + prestamo.getFechaPrestamo());

            if (prestamo.isDevuelto()) {
                System.out.println("Estado: Devuelto");
                System.out.println("Fecha de devolución: " + prestamo.getFechaDevolucion());
            } else {
                System.out.println("Estado: Prestado");
            }

            System.out.println("--------------------");
        }
    }
}
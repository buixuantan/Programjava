package PhoneBookManagement;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {

    ArrayList<String> phoneBooks = new ArrayList<>();


    @Override
    public void insertPhone(String name, String phone) {
        if (phoneBooks.isEmpty()) {
            phoneBooks.add(name + "," + phone);
            System.out.println("added " + name + " and " + phone + " into phone number");

        } else {
            boolean find = false;
            for (String phonebook : phoneBooks) {
                if (phonebook.split(",")[0].equals(name)) {
                    find = true;

                    if (!phonebook.contains(phone))
                        phoneBooks.set(phoneBooks.indexOf(phonebook), phonebook + " : " + phone);
                    System.out.println("added " + phone + " into with " + name);

                    if (phonebook.contains(phone)) {
                        System.out.println(name + " and " + phone + " exist!");
                    }
                }
                break;
            }
            if (!find) {
                phoneBooks.add(name + " , " + phone);
                System.out.println("added " + name + " and " + phone + " into phone number");
            }
        }
    }

    @Override
    public void removePhone(String name) {
        if (phoneBooks.isEmpty()) {
            System.out.println("phone book is empty!");
        } else {
            boolean find = false;
            for (String phonebook : phoneBooks) {
                if (phonebook.split(",")[0].equals(name)) {
                    find = true;
                    phoneBooks.remove(name);
                    System.out.println("deleted " + name + " in phonebook");
                    break;
                }
            }
            if (!find) {
                System.out.println("not find " + name);
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        if (phoneBooks.isEmpty()) {
            System.out.println("phone book is empty!");
        } else {
            String phonebook = searchPhone(name);
            if (phonebook != null) {
                if(!phonebook.contains(newphone)) {
                    phoneBooks.set(phoneBooks.indexOf(phonebook),phonebook.split(",")[0]+","+ newphone);
                }
            }
            else {
                System.out.println("not find " + name + "!");
            }
        }
    }

    @Override
    public String searchPhone(String name) {
        for (String phonebook : phoneBooks) {
            if (phonebook.split(",")[0].equals(name)) {
                return phonebook;
            }
        }
        return null;
    }

    @Override
    public void sort() {
        if (phoneBooks.isEmpty()) {
            System.out.println("phone book is empty!");
        } else {
            Collections.sort(phoneBooks, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if (o1.compareTo(o2) > 0) {
                        return 1;
                    } else if (o1.compareTo(o2) == 0) {
                        return 0;
                    }
                    return -1;
                }
            });
            System.out.println(phoneBooks);
        }

    }
}

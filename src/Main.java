public class Main {
    public static void main(String [] args){
        ContactsManager myContactsManager = new ContactsManager();

        Contact jeff = new Contact();
        jeff.name = "Jeff Blasius";
        //jeff.email = "jeffrey.blasius@gmail.com";
        jeff.phoneNumber = "480-390-7547";
        myContactsManager.addContact(jeff);

        Contact leann = new Contact();
        leann.name = "LeAnn Blasius";
        leann.phoneNumber = "480-390-7546";
        myContactsManager.addContact(leann);

        Contact sierra = new Contact();
        sierra.name = "Sierra Blasius";
        sierra.phoneNumber = "480-331-3380";
        myContactsManager.addContact(sierra);

        Contact isContact;
        String searchName;
        searchName = "Sierr Blasius";
        isContact = myContactsManager.searchContact(searchName);
        if (isContact != null) {
            System.out.println("Contact " + searchName + "found!");
        } else {
            System.out.println("Contact " + searchName + " not found!");
        }
    }
}

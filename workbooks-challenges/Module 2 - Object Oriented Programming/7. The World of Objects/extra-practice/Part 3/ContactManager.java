public class ContactManager {
    private Contact[] contacts;

    public ContactManager(Contact[] source) {
        contacts = new Contact[source.length];

        for (int i = 0; i < contacts.length; ++i) {
            this.contacts[i] = new Contact(source[i]);
        }
    }

    public Contact getContact(int index) {
        return new Contact(this.contacts[index]);
    }

    public void setContact(int index, Contact contact) {
        this.contacts[index] = new Contact(contact);
    }
}

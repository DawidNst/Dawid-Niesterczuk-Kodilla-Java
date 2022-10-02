package challenges;

public class User {
    private final String userName;
    private final String userEmail;
    private final int userTelephoneNumber;
    private final String userAddress;

    public User(final String userName, final String userEmail, final int userTelephoneNumber, final String userAddress) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userTelephoneNumber = userTelephoneNumber;
        this.userAddress = userAddress;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public int getUserTelephoneNumber() {
        return userTelephoneNumber;
    }

    public String getUserAddress() {
        return userAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userTelephoneNumber != user.userTelephoneNumber) return false;
        if (!userName.equals(user.userName)) return false;
        return userEmail.equals(user.userEmail);
    }

    @Override
    public int hashCode() {
        int result = userName.hashCode();
        result = 31 * result + userEmail.hashCode();
        result = 31 * result + userTelephoneNumber;
        return result;
    }

    @Override
    public String toString() {
        return "[" +
                userName +
                ", e-mail: " + userEmail +
                ", Phone: " + userTelephoneNumber +
                ", Address: " + userAddress +
                "]";
    }
}
package iterator.spammer;

import iterator.ProfileIterator;
import iterator.profile.Profile;
import iterator.social_networks.SocialNetwork;

public class SocialSpammer {
  public SocialNetwork network;
  public ProfileIterator iterator;

  public SocialSpammer(SocialNetwork network) {
    this.network = network;
  }

  public void sendSpamToFriends(String profileEmail, String message) {
    System.out.println("\nIteration over friends...\n");
    iterator = network.createFriendsIterator(profileEmail);
    while (iterator.hasNext()) {
      Profile profile = iterator.getNext();
      sendMessage(profile.getEmail(), message);
    }
  }

  public void sendSpamToCoworkers(String profileEmail, String message) {
    System.out.println("\nIteration over coworker...\n");
    iterator = network.createCoworkersIterator(profileEmail);
    while (iterator.hasNext()) {
      Profile profile = iterator.getNext();
      sendMessage(profile.getEmail(), message);
    }
  }

  public void sendMessage(String email, String message) {
    System.out.println("Send message to: '" + email + "'. Message body: '" + message + "'" );
  }
}

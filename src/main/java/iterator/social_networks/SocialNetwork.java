package iterator.social_networks;

import iterator.ProfileIterator;

public interface SocialNetwork {
  ProfileIterator createFriendsIterator(String profileEmail);
  ProfileIterator createCoworkersIterator(String profileEmail);
}

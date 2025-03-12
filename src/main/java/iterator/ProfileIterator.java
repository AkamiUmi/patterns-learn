package iterator;

import iterator.profile.Profile;

public interface ProfileIterator {
  boolean hasNext();
  Profile getNext();
  void reset();
}

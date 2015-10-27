package cf.zvlad.pindialoglibrary;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zvlad on 10/26/15.
 */
public class PinCode {
    List<Character> enteredCharacters;
    StringBuilder pin;

    public PinCode() {
        enteredCharacters = new ArrayList<>();
        pin = new StringBuilder();
    }

    public void add(Character character){
        enteredCharacters.add(character);
    }

    public int size(){
        return enteredCharacters.size();
    }

    public void clearAll() {
        if (enteredCharacters.isEmpty()){
            return;
        }
        enteredCharacters.clear();
    }

    @Override
    public String toString() {
        resetPin();
        for (int i = 0; i < enteredCharacters.size(); i++) {
            pin.append(enteredCharacters.get(i));
        }
        return pin.toString();
    }

    private void resetPin() {
        pin.delete(0, pin.length());
    }

    public void clearLastEnteredCharacter() {
        if (enteredCharacters.size() == 1){
            enteredCharacters.clear();
        } else if (enteredCharacters.size() > 1) {
            int lastCharacterIndex = enteredCharacters.size() - 1;
            enteredCharacters.remove(lastCharacterIndex);
        }
    }
}
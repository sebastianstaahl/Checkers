import java.util.*;

public class StateObject implements Comparable<StateObject> {

      public double value;
      public GameState state;
      Vector<StateObject> childStates;

      //Vector<GameState> nextStates;// = new Vector<GameState>();

        public StateObject(GameState s) {
          state=s;
      }

      public StateObject(GameState s, int v) {
        state=s;
        value =v;
    }

      public double getValue() {
        return value;
      }




      public int compareTo(StateObject state) {
          return this.value < state.value ? 1 : this.value > state.value ? -1 : 0;
      }

}

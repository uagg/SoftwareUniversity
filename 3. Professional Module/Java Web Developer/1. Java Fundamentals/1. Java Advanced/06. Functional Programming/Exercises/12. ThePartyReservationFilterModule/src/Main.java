/*
You are a young and talented developer. The first task you need to do is to implement a filtering module to a party
reservation software. First, The Party Reservation Filter Module (TPRF Module for short) is passed a list with
invitations. Next the TPRF receives a sequence of commands that specify if you need to add or remove a given filter.
TPRF Commands are in the given format {command;filter type;filter parameter}
You can receive the following TPRF commands: "Add filter", "Remove filter" or "Print". The possible TPRF filter types
are: "Starts with", "Ends with", "Length" and "Contains". All TPRF filter parameters will be a string (or an integer
for the length filter).
The input will end with a "Print" command.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Filter> filters = new ArrayList<>();
        List<String> names = new ArrayList<>(Arrays.asList(reader.readLine().split("\\s+")));
        while(true){
            String command = reader.readLine();
            if(command.equalsIgnoreCase("print")){
                break;
            }

            String[] params = command.split(";");

            Filter filter = new Filter(params[1],params[2]);
            manageFilters(params[0], filter, filters);
        }

        printNames(names,filters);
    }

    private static void printNames(List<String> names, List<Filter> filters) {
        for (String name : names) {
            boolean showName = true;
            for (Filter filter : filters) {
                if(filter.getPredicate().test(name)){
                    showName = false;
                    break;
                }
            }

            if(showName){
                System.out.print(name + " ");
            }
        }
    }

    private static void manageFilters( String command, Filter filter, List<Filter> filters) {
        switch(command){
            case "Add filter":
                filters.add(filter);
                break;
            case "Remove filter":
                for (int i = 0; i <filters.size() ; i++) {
                    if(filters.get(i).equals(filter)){
                        filters.remove(i);
                        i--;
                    }
                }
                break;
        }
    }

    private static class Filter{
        Predicate<String> predicate;
        String condition;
        String value;

        Filter(String condition, String value) {
            this.condition = condition;
            this.value = value;
            switch (this.condition){
                case "Starts with":
                    this.predicate = x->x.startsWith(value);
                case "Ends with":
                    this.predicate = x->x.endsWith(value);
                case "Length":
                    this.predicate = x->x.length() == Integer.parseInt(value);
                case "Contains":
                    this.predicate = x->x.contains(value);
            }
        }

        Predicate<String> getPredicate() {
            return predicate;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Filter filter1 = (Filter) o;

            return condition.equals(filter1.condition) && value.equals(filter1.value);
        }

        @Override
        public int hashCode() {
            int result = condition.hashCode();
            result = 31 * result + value.hashCode();
            return result;
        }
    }
}
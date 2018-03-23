package seedu.address.model.activity;

import java.util.function.Predicate;

public class EventOnlyPredicate implements Predicate<Activity> {

    public EventOnlyPredicate() {
        ;
    }

    @Override
    public boolean test(Activity activity) {
        return activity.getActivityType().equals("EVENT");
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof EventOnlyPredicate); // instanceof handles nulls
    }

}
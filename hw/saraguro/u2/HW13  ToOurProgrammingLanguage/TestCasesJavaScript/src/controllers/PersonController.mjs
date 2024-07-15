
import { differenceInDays, differenceInYears } from 'date-fns';

class PersonController {
    computageAgeInDays(birthDate) {
        const now = new Date();
        return differenceInDays(now, new Date(birthDate));
    }

    computageAgeInYears(birthDate) {
        const now = new Date();
        return differenceInYears(now, new Date(birthDate));
    }
}

export default PersonController;

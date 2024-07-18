class PersonController {
    computeAgeInDays(birthDate) {
        const today = new Date();
        const birth = new Date(birthDate);
        const differenceInTime = today - birth;
        const differenceInDays = Math.floor(differenceInTime / (1000 * 3600 * 24));
        return differenceInDays;
    }

    computeAgeInYears(birthDate) {
        const today = new Date();
        const birth = new Date(birthDate);
        let years = today.getFullYear() - birth.getFullYear();
        const monthDifference = today.getMonth() - birth.getMonth();
        if (monthDifference < 0 || (monthDifference === 0 && today.getDate() < birth.getDate())) {
            years--;
        }
        return years;
    }
}

module.exports = PersonController;

export class PersonController  {
    static computeAgeInDays(birthDate) {
        const today = new Date();
        const birth = new Date(birthDate);
        
        // Calculamos la diferencia en milisegundos
        const diffTime = Math.abs(today - birth);
        // Convertimos la diferencia a días
        const totalDays = Math.floor(diffTime / (1000 * 60 * 60 * 24));
        
        return totalDays;
    }
    
    static computerAgeInyears(birthDate) {
        const today = new Date();
        const birth = new Date(birthDate);
        
        let years = today.getFullYear() - birth.getFullYear();
        const m = today.getMonth() - birth.getMonth();
        if (m < 0 || (m === 0 && today.getDate() < birth.getDate())) {
            years--;
        }
        
        return years;
    }
}
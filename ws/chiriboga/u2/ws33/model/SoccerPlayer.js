class SoccerPlayer {
    constructor(id, name, age, goals, matchesPlayed) {
      this.id = id;
      this.name = name;
      this.age = age;
      this.goals = goals;
      this.matchesPlayed = matchesPlayed;
    }
  
    calculateGoalsAverage() {
      return this.matchesPlayed === 0 ? 0 : this.goals / this.matchesPlayed;
    }
  
    calculateOffensiveEfficiency() {
      return this.matchesPlayed === 0 ? 0 : (this.goals / this.matchesPlayed) * 100;
    }
  }
  
  module.exports = SoccerPlayer;
  

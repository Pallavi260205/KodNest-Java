public class DailyProgress {
    
    public static void main(String[] args) {
        int completedTopics = 17;
        int totalTopics = 20;
        int dailyLearningHours = 3;
        int learningDays = 5;

        // Calculate remaining topics
        int remainingTopics = totalTopics - completedTopics;

        // Calculate total learning hours for the week
        int totalLearningHours = dailyLearningHours * learningDays;

        // Calculate progress percentage
        double progressPercentage = (double) completedTopics / totalTopics * 100;

        // Display the results
        System.out.println("Completed Topics: " + completedTopics);
        System.out.println("Remaining Topics: " + remainingTopics);
        System.out.println("Total Learning Hours: " + totalLearningHours);
        System.out.println("Progress Percentage: " + progressPercentage + "%");
    }
}

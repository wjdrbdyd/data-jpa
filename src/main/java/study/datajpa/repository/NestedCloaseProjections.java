package study.datajpa.repository;

public interface NestedCloaseProjections {
    String getUsername();
    TeamInfo getTeam();

    interface TeamInfo {
        String getName();
    }
}

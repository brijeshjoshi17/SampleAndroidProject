package com.brijesh.sampleandroidproject.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * POJO that serves as the response from the GitHub request to fetch repos. Generated using
 * http://www.jsonschema2pojo.org/
 */
public class Repository implements Serializable {
    private static final long serialVersionUID = 4336131119721828032L;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("private")
    @Expose
    private Boolean _private;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("fork")
    @Expose
    private Boolean fork;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("forks_url")
    @Expose
    private String forksUrl;
    @SerializedName("keys_url")
    @Expose
    private String keysUrl;
    @SerializedName("collaborators_url")
    @Expose
    private String collaboratorsUrl;
    @SerializedName("teams_url")
    @Expose
    private String teamsUrl;
    @SerializedName("hooks_url")
    @Expose
    private String hooksUrl;
    @SerializedName("issue_events_url")
    @Expose
    private String issueEventsUrl;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;
    @SerializedName("assignees_url")
    @Expose
    private String assigneesUrl;
    @SerializedName("branches_url")
    @Expose
    private String branchesUrl;
    @SerializedName("tags_url")
    @Expose
    private String tagsUrl;
    @SerializedName("blobs_url")
    @Expose
    private String blobsUrl;
    @SerializedName("git_tags_url")
    @Expose
    private String gitTagsUrl;
    @SerializedName("git_refs_url")
    @Expose
    private String gitRefsUrl;
    @SerializedName("trees_url")
    @Expose
    private String treesUrl;
    @SerializedName("statuses_url")
    @Expose
    private String statusesUrl;
    @SerializedName("languages_url")
    @Expose
    private String languagesUrl;
    @SerializedName("stargazers_url")
    @Expose
    private String stargazersUrl;
    @SerializedName("contributors_url")
    @Expose
    private String contributorsUrl;
    @SerializedName("subscribers_url")
    @Expose
    private String subscribersUrl;
    @SerializedName("subscription_url")
    @Expose
    private String subscriptionUrl;
    @SerializedName("commits_url")
    @Expose
    private String commitsUrl;
    @SerializedName("git_commits_url")
    @Expose
    private String gitCommitsUrl;
    @SerializedName("comments_url")
    @Expose
    private String commentsUrl;
    @SerializedName("issue_comment_url")
    @Expose
    private String issueCommentUrl;
    @SerializedName("contents_url")
    @Expose
    private String contentsUrl;
    @SerializedName("compare_url")
    @Expose
    private String compareUrl;
    @SerializedName("merges_url")
    @Expose
    private String mergesUrl;
    @SerializedName("archive_url")
    @Expose
    private String archiveUrl;
    @SerializedName("downloads_url")
    @Expose
    private String downloadsUrl;
    @SerializedName("issues_url")
    @Expose
    private String issuesUrl;
    @SerializedName("pulls_url")
    @Expose
    private String pullsUrl;
    @SerializedName("milestones_url")
    @Expose
    private String milestonesUrl;
    @SerializedName("notifications_url")
    @Expose
    private String notificationsUrl;
    @SerializedName("labels_url")
    @Expose
    private String labelsUrl;
    @SerializedName("releases_url")
    @Expose
    private String releasesUrl;
    @SerializedName("deployments_url")
    @Expose
    private String deploymentsUrl;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("pushed_at")
    @Expose
    private String pushedAt;
    @SerializedName("git_url")
    @Expose
    private String gitUrl;
    @SerializedName("ssh_url")
    @Expose
    private String sshUrl;
    @SerializedName("clone_url")
    @Expose
    private String cloneUrl;
    @SerializedName("svn_url")
    @Expose
    private String svnUrl;
    @SerializedName("homepage")
    @Expose
    private Object homepage;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("stargazers_count")
    @Expose
    private Integer stargazersCount;
    @SerializedName("watchers_count")
    @Expose
    private Integer watchersCount;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("has_issues")
    @Expose
    private Boolean hasIssues;
    @SerializedName("has_projects")
    @Expose
    private Boolean hasProjects;
    @SerializedName("has_downloads")
    @Expose
    private Boolean hasDownloads;
    @SerializedName("has_wiki")
    @Expose
    private Boolean hasWiki;
    @SerializedName("has_pages")
    @Expose
    private Boolean hasPages;
    @SerializedName("forks_count")
    @Expose
    private Integer forksCount;
    @SerializedName("mirror_url")
    @Expose
    private Object mirrorUrl;
    @SerializedName("open_issues_count")
    @Expose
    private Integer openIssuesCount;
    @SerializedName("forks")
    @Expose
    private Integer forks;
    @SerializedName("open_issues")
    @Expose
    private Integer openIssues;
    @SerializedName("watchers")
    @Expose
    private Integer watchers;
    @SerializedName("default_branch")
    @Expose
    private String defaultBranch;
    @SerializedName("permissions")
    @Expose
    private Permissions permissions;

    public String getArchiveUrl() {
        return archiveUrl;
    }

    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public String getBlobsUrl() {
        return blobsUrl;
    }

    public String getBranchesUrl() {
        return branchesUrl;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public String getCompareUrl() {
        return compareUrl;
    }

    public String getContentsUrl() {
        return contentsUrl;
    }

    public String getContributorsUrl() {
        return contributorsUrl;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public String getDescription() {
        return description;
    }

    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public Boolean getFork() {
        return fork;
    }

    public Integer getForks() {
        return forks;
    }

    public Integer getForksCount() {
        return forksCount;
    }

    public String getForksUrl() {
        return forksUrl;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    public Boolean getHasIssues() {
        return hasIssues;
    }

    public Boolean getHasPages() {
        return hasPages;
    }

    public Boolean getHasProjects() {
        return hasProjects;
    }

    public Boolean getHasWiki() {
        return hasWiki;
    }

    public Object getHomepage() {
        return homepage;
    }

    public String getHooksUrl() {
        return hooksUrl;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public Integer getId() {
        return id;
    }

    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public String getKeysUrl() {
        return keysUrl;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public String getLanguage() {
        return language;
    }

    public String getLanguagesUrl() {
        return languagesUrl;
    }

    public String getMergesUrl() {
        return mergesUrl;
    }

    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public Object getMirrorUrl() {
        return mirrorUrl;
    }

    public String getName() {
        return name;
    }

    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public Integer getOpenIssues() {
        return openIssues;
    }

    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    public Owner getOwner() {
        return owner;
    }

    public Permissions getPermissions() {
        return permissions;
    }

    public Boolean getPrivate() {
        return _private;
    }

    public String getPullsUrl() {
        return pullsUrl;
    }

    public String getPushedAt() {
        return pushedAt;
    }

    public String getReleasesUrl() {
        return releasesUrl;
    }

    public Integer getSize() {
        return size;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public Integer getStargazersCount() {
        return stargazersCount;
    }

    public String getStargazersUrl() {
        return stargazersUrl;
    }

    public String getStatusesUrl() {
        return statusesUrl;
    }

    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public String getSvnUrl() {
        return svnUrl;
    }

    public String getTagsUrl() {
        return tagsUrl;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public String getTreesUrl() {
        return treesUrl;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getUrl() {
        return url;
    }

    public Integer getWatchers() {
        return watchers;
    }

    public Integer getWatchersCount() {
        return watchersCount;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public void setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    public void setForks(Integer forks) {
        this.forks = forks;
    }

    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public void setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public void setHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
    }

    public void setHasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public void setHomepage(Object homepage) {
        this.homepage = homepage;
    }

    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public void setMirrorUrl(Object mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public void setOpenIssues(Integer openIssues) {
        this.openIssues = openIssues;
    }

    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public void setStargazersCount(Integer stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public void setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
    }

    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setWatchers(Integer watchers) {
        this.watchers = watchers;
    }

    public void setWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
    }

    private class Owner implements Serializable {
        private static final long serialVersionUID = 2101665082320233237L;
        @SerializedName("login")
        @Expose
        private String login;
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("avatar_url")
        @Expose
        private String avatarUrl;
        @SerializedName("gravatar_id")
        @Expose
        private String gravatarId;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("html_url")
        @Expose
        private String htmlUrl;
        @SerializedName("followers_url")
        @Expose
        private String followersUrl;
        @SerializedName("following_url")
        @Expose
        private String followingUrl;
        @SerializedName("gists_url")
        @Expose
        private String gistsUrl;
        @SerializedName("starred_url")
        @Expose
        private String starredUrl;
        @SerializedName("subscriptions_url")
        @Expose
        private String subscriptionsUrl;
        @SerializedName("organizations_url")
        @Expose
        private String organizationsUrl;
        @SerializedName("repos_url")
        @Expose
        private String reposUrl;
        @SerializedName("events_url")
        @Expose
        private String eventsUrl;
        @SerializedName("received_events_url")
        @Expose
        private String receivedEventsUrl;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("site_admin")
        @Expose
        private Boolean siteAdmin;

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public String getEventsUrl() {
            return eventsUrl;
        }

        public String getFollowersUrl() {
            return followersUrl;
        }

        public String getFollowingUrl() {
            return followingUrl;
        }

        public String getGistsUrl() {
            return gistsUrl;
        }

        public String getGravatarId() {
            return gravatarId;
        }

        public String getHtmlUrl() {
            return htmlUrl;
        }

        public Integer getId() {
            return id;
        }

        public String getLogin() {
            return login;
        }

        public String getOrganizationsUrl() {
            return organizationsUrl;
        }

        public String getReceivedEventsUrl() {
            return receivedEventsUrl;
        }

        public String getReposUrl() {
            return reposUrl;
        }

        public Boolean getSiteAdmin() {
            return siteAdmin;
        }

        public String getStarredUrl() {
            return starredUrl;
        }

        public String getSubscriptionsUrl() {
            return subscriptionsUrl;
        }

        public String getType() {
            return type;
        }

        public String getUrl() {
            return url;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public void setEventsUrl(String eventsUrl) {
            this.eventsUrl = eventsUrl;
        }

        public void setFollowersUrl(String followersUrl) {
            this.followersUrl = followersUrl;
        }

        public void setFollowingUrl(String followingUrl) {
            this.followingUrl = followingUrl;
        }

        public void setGistsUrl(String gistsUrl) {
            this.gistsUrl = gistsUrl;
        }

        public void setGravatarId(String gravatarId) {
            this.gravatarId = gravatarId;
        }

        public void setHtmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public void setOrganizationsUrl(String organizationsUrl) {
            this.organizationsUrl = organizationsUrl;
        }

        public void setReceivedEventsUrl(String receivedEventsUrl) {
            this.receivedEventsUrl = receivedEventsUrl;
        }

        public void setReposUrl(String reposUrl) {
            this.reposUrl = reposUrl;
        }

        public void setSiteAdmin(Boolean siteAdmin) {
            this.siteAdmin = siteAdmin;
        }

        public void setStarredUrl(String starredUrl) {
            this.starredUrl = starredUrl;
        }

        public void setSubscriptionsUrl(String subscriptionsUrl) {
            this.subscriptionsUrl = subscriptionsUrl;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    private class Permissions implements Serializable {
        private static final long serialVersionUID = -7260553102115139762L;

        @SerializedName("admin")
        @Expose
        private Boolean admin;
        @SerializedName("push")
        @Expose
        private Boolean push;
        @SerializedName("pull")
        @Expose
        private Boolean pull;

        public Boolean getAdmin() {
            return admin;
        }

        public Boolean getPull() {
            return pull;
        }

        public Boolean getPush() {
            return push;
        }

        public void setAdmin(Boolean admin) {
            this.admin = admin;
        }

        public void setPull(Boolean pull) {
            this.pull = pull;
        }

        public void setPush(Boolean push) {
            this.push = push;
        }

    }

}
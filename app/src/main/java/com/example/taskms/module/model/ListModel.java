package com.example.taskms.module.model;

import com.google.gson.annotations.SerializedName;

public class ListModel {


    private String tags_url;

    @SerializedName("private")
    private boolean isPrivate;

    private String contributors_url;

    private String notifications_url;

    private String description;

    private String subscription_url;

    private String keys_url;

    private String branches_url;

    private String deployments_url;

    private String issue_comment_url;

    private String labels_url;

    private String subscribers_url;

    private String releases_url;

    private String comments_url;

    private String stargazers_url;

    private String id;

    private Owner owner;

    private String archive_url;

    private String commits_url;

    private String git_refs_url;

    private String forks_url;

    private String compare_url;

    private String statuses_url;

    private String git_commits_url;

    private String blobs_url;

    private String git_tags_url;

    private String merges_url;

    private String downloads_url;

    private String url;

    private String contents_url;

    private String milestones_url;

    private String teams_url;

    private String fork;

    private String issues_url;

    private String full_name;

    private String events_url;

    private String issue_events_url;

    private String languages_url;

    private String html_url;

    private String collaborators_url;

    private String name;

    private String pulls_url;

    private String hooks_url;

    private String assignees_url;

    private String trees_url;

    private String node_id;

    private String comment;

    private static ListModel gInstance;

    public static ListModel getInstance(){
        if (gInstance == null){
            gInstance = new ListModel();
        }
        return gInstance;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTags_url ()
    {
        return tags_url;
    }

    public void setTags_url (String tags_url)
    {
        this.tags_url = tags_url;
    }

    public boolean getPrivate ()
    {
        return isPrivate;
    }

    public void setPrivate (boolean isPrivate)
    {
        this.isPrivate = isPrivate;
    }

    public String getContributors_url ()
    {
        return contributors_url;
    }

    public void setContributors_url (String contributors_url)
    {
        this.contributors_url = contributors_url;
    }

    public String getNotifications_url ()
    {
        return notifications_url;
    }

    public void setNotifications_url (String notifications_url)
    {
        this.notifications_url = notifications_url;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getSubscription_url ()
    {
        return subscription_url;
    }

    public void setSubscription_url (String subscription_url)
    {
        this.subscription_url = subscription_url;
    }

    public String getKeys_url ()
    {
        return keys_url;
    }

    public void setKeys_url (String keys_url)
    {
        this.keys_url = keys_url;
    }

    public String getBranches_url ()
    {
        return branches_url;
    }

    public void setBranches_url (String branches_url)
    {
        this.branches_url = branches_url;
    }

    public String getDeployments_url ()
    {
        return deployments_url;
    }

    public void setDeployments_url (String deployments_url)
    {
        this.deployments_url = deployments_url;
    }

    public String getIssue_comment_url ()
    {
        return issue_comment_url;
    }

    public void setIssue_comment_url (String issue_comment_url)
    {
        this.issue_comment_url = issue_comment_url;
    }

    public String getLabels_url ()
    {
        return labels_url;
    }

    public void setLabels_url (String labels_url)
    {
        this.labels_url = labels_url;
    }

    public String getSubscribers_url ()
    {
        return subscribers_url;
    }

    public void setSubscribers_url (String subscribers_url)
    {
        this.subscribers_url = subscribers_url;
    }

    public String getReleases_url ()
    {
        return releases_url;
    }

    public void setReleases_url (String releases_url)
    {
        this.releases_url = releases_url;
    }

    public String getComments_url ()
    {
        return comments_url;
    }

    public void setComments_url (String comments_url)
    {
        this.comments_url = comments_url;
    }

    public String getStargazers_url ()
    {
        return stargazers_url;
    }

    public void setStargazers_url (String stargazers_url)
    {
        this.stargazers_url = stargazers_url;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Owner getOwner ()
    {
        return owner;
    }

    public void setOwner (Owner owner)
    {
        this.owner = owner;
    }

    public String getArchive_url ()
    {
        return archive_url;
    }

    public void setArchive_url (String archive_url)
    {
        this.archive_url = archive_url;
    }

    public String getCommits_url ()
    {
        return commits_url;
    }

    public void setCommits_url (String commits_url)
    {
        this.commits_url = commits_url;
    }

    public String getGit_refs_url ()
    {
        return git_refs_url;
    }

    public void setGit_refs_url (String git_refs_url)
    {
        this.git_refs_url = git_refs_url;
    }

    public String getForks_url ()
    {
        return forks_url;
    }

    public void setForks_url (String forks_url)
    {
        this.forks_url = forks_url;
    }

    public String getCompare_url ()
    {
        return compare_url;
    }

    public void setCompare_url (String compare_url)
    {
        this.compare_url = compare_url;
    }

    public String getStatuses_url ()
    {
        return statuses_url;
    }

    public void setStatuses_url (String statuses_url)
    {
        this.statuses_url = statuses_url;
    }

    public String getGit_commits_url ()
    {
        return git_commits_url;
    }

    public void setGit_commits_url (String git_commits_url)
    {
        this.git_commits_url = git_commits_url;
    }

    public String getBlobs_url ()
    {
        return blobs_url;
    }

    public void setBlobs_url (String blobs_url)
    {
        this.blobs_url = blobs_url;
    }

    public String getGit_tags_url ()
    {
        return git_tags_url;
    }

    public void setGit_tags_url (String git_tags_url)
    {
        this.git_tags_url = git_tags_url;
    }

    public String getMerges_url ()
    {
        return merges_url;
    }

    public void setMerges_url (String merges_url)
    {
        this.merges_url = merges_url;
    }

    public String getDownloads_url ()
    {
        return downloads_url;
    }

    public void setDownloads_url (String downloads_url)
    {
        this.downloads_url = downloads_url;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String getContents_url ()
    {
        return contents_url;
    }

    public void setContents_url (String contents_url)
    {
        this.contents_url = contents_url;
    }

    public String getMilestones_url ()
    {
        return milestones_url;
    }

    public void setMilestones_url (String milestones_url)
    {
        this.milestones_url = milestones_url;
    }

    public String getTeams_url ()
    {
        return teams_url;
    }

    public void setTeams_url (String teams_url)
    {
        this.teams_url = teams_url;
    }

    public String getFork ()
    {
        return fork;
    }

    public void setFork (String fork)
    {
        this.fork = fork;
    }

    public String getIssues_url ()
    {
        return issues_url;
    }

    public void setIssues_url (String issues_url)
    {
        this.issues_url = issues_url;
    }

    public String getFull_name ()
    {
        return full_name;
    }

    public void setFull_name (String full_name)
    {
        this.full_name = full_name;
    }

    public String getEvents_url ()
    {
        return events_url;
    }

    public void setEvents_url (String events_url)
    {
        this.events_url = events_url;
    }

    public String getIssue_events_url ()
    {
        return issue_events_url;
    }

    public void setIssue_events_url (String issue_events_url)
    {
        this.issue_events_url = issue_events_url;
    }

    public String getLanguages_url ()
    {
        return languages_url;
    }

    public void setLanguages_url (String languages_url)
    {
        this.languages_url = languages_url;
    }

    public String getHtml_url ()
    {
        return html_url;
    }

    public void setHtml_url (String html_url)
    {
        this.html_url = html_url;
    }

    public String getCollaborators_url ()
    {
        return collaborators_url;
    }

    public void setCollaborators_url (String collaborators_url)
    {
        this.collaborators_url = collaborators_url;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getPulls_url ()
    {
        return pulls_url;
    }

    public void setPulls_url (String pulls_url)
    {
        this.pulls_url = pulls_url;
    }

    public String getHooks_url ()
    {
        return hooks_url;
    }

    public void setHooks_url (String hooks_url)
    {
        this.hooks_url = hooks_url;
    }

    public String getAssignees_url ()
    {
        return assignees_url;
    }

    public void setAssignees_url (String assignees_url)
    {
        this.assignees_url = assignees_url;
    }

    public String getTrees_url ()
    {
        return trees_url;
    }

    public void setTrees_url (String trees_url)
    {
        this.trees_url = trees_url;
    }

    public String getNode_id ()
    {
        return node_id;
    }

    public void setNode_id (String node_id)
    {
        this.node_id = node_id;
    }

    public class Owner
    {
        private String gists_url;

        private String repos_url;

        private String following_url;

        private String starred_url;

        private String login;

        private String followers_url;

        private String type;

        private String url;

        private String subscriptions_url;

        private String received_events_url;

        private String avatar_url;

        private String events_url;

        private String html_url;

        private String site_admin;

        private String id;

        private String gravatar_id;

        private String node_id;

        private String organizations_url;

        public String getGists_url ()
        {
            return gists_url;
        }

        public void setGists_url (String gists_url)
        {
            this.gists_url = gists_url;
        }

        public String getRepos_url ()
        {
            return repos_url;
        }

        public void setRepos_url (String repos_url)
        {
            this.repos_url = repos_url;
        }

        public String getFollowing_url ()
        {
            return following_url;
        }

        public void setFollowing_url (String following_url)
        {
            this.following_url = following_url;
        }

        public String getStarred_url ()
        {
            return starred_url;
        }

        public void setStarred_url (String starred_url)
        {
            this.starred_url = starred_url;
        }

        public String getLogin ()
        {
            return login;
        }

        public void setLogin (String login)
        {
            this.login = login;
        }

        public String getFollowers_url ()
        {
            return followers_url;
        }

        public void setFollowers_url (String followers_url)
        {
            this.followers_url = followers_url;
        }

        public String getType ()
        {
            return type;
        }

        public void setType (String type)
        {
            this.type = type;
        }

        public String getUrl ()
        {
            return url;
        }

        public void setUrl (String url)
        {
            this.url = url;
        }

        public String getSubscriptions_url ()
        {
            return subscriptions_url;
        }

        public void setSubscriptions_url (String subscriptions_url)
        {
            this.subscriptions_url = subscriptions_url;
        }

        public String getReceived_events_url ()
        {
            return received_events_url;
        }

        public void setReceived_events_url (String received_events_url)
        {
            this.received_events_url = received_events_url;
        }

        public String getAvatar_url ()
        {
            return avatar_url;
        }

        public void setAvatar_url (String avatar_url)
        {
            this.avatar_url = avatar_url;
        }

        public String getEvents_url ()
        {
            return events_url;
        }

        public void setEvents_url (String events_url)
        {
            this.events_url = events_url;
        }

        public String getHtml_url ()
        {
            return html_url;
        }

        public void setHtml_url (String html_url)
        {
            this.html_url = html_url;
        }

        public String getSite_admin ()
        {
            return site_admin;
        }

        public void setSite_admin (String site_admin)
        {
            this.site_admin = site_admin;
        }

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public String getGravatar_id ()
        {
            return gravatar_id;
        }

        public void setGravatar_id (String gravatar_id)
        {
            this.gravatar_id = gravatar_id;
        }

        public String getNode_id ()
        {
            return node_id;
        }

        public void setNode_id (String node_id)
        {
            this.node_id = node_id;
        }

        public String getOrganizations_url ()
        {
            return organizations_url;
        }

        public void setOrganizations_url (String organizations_url)
        {
            this.organizations_url = organizations_url;
        }

    }


}

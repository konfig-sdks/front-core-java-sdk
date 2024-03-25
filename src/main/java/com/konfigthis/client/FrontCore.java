package com.konfigthis.client;

import com.konfigthis.client.api.AccountsApi;
import com.konfigthis.client.api.AnalyticsApi;
import com.konfigthis.client.api.AttachmentsApi;
import com.konfigthis.client.api.ChannelsApi;
import com.konfigthis.client.api.CommentsApi;
import com.konfigthis.client.api.ContactGroupsApi;
import com.konfigthis.client.api.ContactHandlesApi;
import com.konfigthis.client.api.ContactNotesApi;
import com.konfigthis.client.api.ContactsApi;
import com.konfigthis.client.api.ConversationsApi;
import com.konfigthis.client.api.CustomFieldsApi;
import com.konfigthis.client.api.DraftsApi;
import com.konfigthis.client.api.EventsApi;
import com.konfigthis.client.api.InboxesApi;
import com.konfigthis.client.api.KnowledgeBasesApi;
import com.konfigthis.client.api.LinksApi;
import com.konfigthis.client.api.MessageTemplateFoldersApi;
import com.konfigthis.client.api.MessageTemplatesApi;
import com.konfigthis.client.api.MessagesApi;
import com.konfigthis.client.api.RulesApi;
import com.konfigthis.client.api.ShiftsApi;
import com.konfigthis.client.api.SignaturesApi;
import com.konfigthis.client.api.TagsApi;
import com.konfigthis.client.api.TeammatesApi;
import com.konfigthis.client.api.TeamsApi;
import com.konfigthis.client.api.TokenIdentityApi;

public class FrontCore {
    private ApiClient apiClient;
    public final AccountsApi accounts;
    public final AnalyticsApi analytics;
    public final AttachmentsApi attachments;
    public final ChannelsApi channels;
    public final CommentsApi comments;
    public final ContactGroupsApi contactGroups;
    public final ContactHandlesApi contactHandles;
    public final ContactNotesApi contactNotes;
    public final ContactsApi contacts;
    public final ConversationsApi conversations;
    public final CustomFieldsApi customFields;
    public final DraftsApi drafts;
    public final EventsApi events;
    public final InboxesApi inboxes;
    public final KnowledgeBasesApi knowledgeBases;
    public final LinksApi links;
    public final MessageTemplateFoldersApi messageTemplateFolders;
    public final MessageTemplatesApi messageTemplates;
    public final MessagesApi messages;
    public final RulesApi rules;
    public final ShiftsApi shifts;
    public final SignaturesApi signatures;
    public final TagsApi tags;
    public final TeammatesApi teammates;
    public final TeamsApi teams;
    public final TokenIdentityApi tokenIdentity;

    public FrontCore() {
        this(null);
    }

    public FrontCore(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.accounts = new AccountsApi(this.apiClient);
        this.analytics = new AnalyticsApi(this.apiClient);
        this.attachments = new AttachmentsApi(this.apiClient);
        this.channels = new ChannelsApi(this.apiClient);
        this.comments = new CommentsApi(this.apiClient);
        this.contactGroups = new ContactGroupsApi(this.apiClient);
        this.contactHandles = new ContactHandlesApi(this.apiClient);
        this.contactNotes = new ContactNotesApi(this.apiClient);
        this.contacts = new ContactsApi(this.apiClient);
        this.conversations = new ConversationsApi(this.apiClient);
        this.customFields = new CustomFieldsApi(this.apiClient);
        this.drafts = new DraftsApi(this.apiClient);
        this.events = new EventsApi(this.apiClient);
        this.inboxes = new InboxesApi(this.apiClient);
        this.knowledgeBases = new KnowledgeBasesApi(this.apiClient);
        this.links = new LinksApi(this.apiClient);
        this.messageTemplateFolders = new MessageTemplateFoldersApi(this.apiClient);
        this.messageTemplates = new MessageTemplatesApi(this.apiClient);
        this.messages = new MessagesApi(this.apiClient);
        this.rules = new RulesApi(this.apiClient);
        this.shifts = new ShiftsApi(this.apiClient);
        this.signatures = new SignaturesApi(this.apiClient);
        this.tags = new TagsApi(this.apiClient);
        this.teammates = new TeammatesApi(this.apiClient);
        this.teams = new TeamsApi(this.apiClient);
        this.tokenIdentity = new TokenIdentityApi(this.apiClient);
    }

}
